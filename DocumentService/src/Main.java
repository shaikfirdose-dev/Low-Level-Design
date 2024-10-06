import Constant.AccessType;
import Service.DocumentServiceImpl;
import Service.IDocumentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IDocumentService documentService = new DocumentServiceImpl();
        //create
        documentService.createDocument("USERA", "Doc1", "This is a content of Doc1");

        //create
        documentService.createDocument("USERB", "Doc2", "This is a content of Doc2");
        //read
        System.out.println(documentService.readDocument("USERA", "Doc1"));

        //Edit
        documentService.editDocument("USERA", "Doc1", "Content updated for Doc1");

        //read
        System.out.println(documentService.readDocument("USERA", "Doc1"));

        //view Document
        System.out.println(documentService.getAllDocuments());

        //delete
        documentService.deleteDocument("USERB", "Doc2");

        System.out.println(documentService.getAllDocuments());

        //grant access to new User
        try{
            documentService.grantAccess("USERA", "Doc1", "USERB", AccessType.READ);
        }
        catch(SecurityException e){
            System.out.println(e.getMessage());
        }

        //read
        System.out.println(documentService.readDocument("USERB", "Doc1"));
    }
}