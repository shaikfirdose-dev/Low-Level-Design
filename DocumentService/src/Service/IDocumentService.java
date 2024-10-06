package Service;

import Constant.AccessType;
import Model.Document;

import java.util.List;
import java.util.Map;

public interface IDocumentService {
    public Document createDocument(String userName, String name, String content);
    public String readDocument(String userName, String documentName);
    public Document editDocument(String userName, String documentName, String newContent);
    public void deleteDocument(String userName, String documentName);
    public void grantAccess(String userName, String documentName, String requiredAccessToUserName, AccessType accessType);
    public Map<String,Document> getAllDocuments();
}
