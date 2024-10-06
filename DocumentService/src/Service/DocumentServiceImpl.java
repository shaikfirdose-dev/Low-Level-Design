package Service;

import Constant.AccessType;
import Model.Document;
import Model.User;

import java.util.HashMap;
import java.util.Map;

public class DocumentServiceImpl implements IDocumentService{
    HashMap<String, User> users = new HashMap<>();
    Map<String,Document> documents = new HashMap<>();
    @Override
    public Document createDocument(String userName, String name, String content) {
        User user = users.computeIfAbsent(userName, User::new);
        if(documents.containsKey(name)){
            throw new IllegalArgumentException("Document is already exists");
        }
        Document document = new Document(name, content, user);
        documents.put(name, document);
        return document;
    }

    @Override
    public String readDocument(String userName, String documentName) {
        User user = users.computeIfAbsent(userName, User::new);
        Document document = documents.get(documentName);
        if(document.getOwner().equals(user) || document.hasAccess(user, AccessType.READ)){
            return document.getContent();
        }
        throw new IllegalArgumentException("User does not have access to this file");
    }

    @Override
    public Document editDocument(String userName, String documentName, String newContent) {
        User user = users.computeIfAbsent(userName, User::new);
        Document document = documents.get(documentName);
        if(document.getOwner().equals(user)){
            document.setContent(newContent);
            documents.put(documentName, document);
        }
        return document;
    }

    @Override
    public void deleteDocument(String userName, String documentName) {
        User user = users.computeIfAbsent(userName, User::new);
        Document document = documents.get(documentName);
        if(document.getOwner().equals(user)){
            documents.remove(documentName);
        }
        return;
    }

    @Override
    public void grantAccess(String userName, String documentName, String requiredAccessToUserName, AccessType accessType) {
        User user = users.computeIfAbsent(userName, User::new);
        User newUser = users.computeIfAbsent(requiredAccessToUserName, User::new);
        Document document = documents.get(documentName);
        if(document.getOwner().equals(user)){
            document.grantAccess(newUser, accessType);;
        }
        else{
            throw new SecurityException("Only owner can give access to other users");
        }
        return;
    }

    @Override
    public Map<String, Document> getAllDocuments() {
        return documents;
    }
}
