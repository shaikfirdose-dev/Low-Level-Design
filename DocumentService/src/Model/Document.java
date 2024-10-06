package Model;

import Constant.AccessType;

import java.util.HashMap;

public class Document {
    private String name;
    private String content;
    private User owner;
    private final HashMap<User, AccessType> accessControlList;

    public Document(String name, String content, User owner) {
        this.name = name;
        this.content = content;
        this.owner = owner;
        accessControlList = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public HashMap<User, AccessType> getAccessControlList() {
        return accessControlList;
    }



    public void grantAccess(User user, AccessType accessType){
        accessControlList.put(user, accessType);
    }

    public AccessType getAccess(User user){
        return accessControlList.get(user);
    }

    public boolean hasAccess(User user, AccessType accessType){
        AccessType accessLevel = accessControlList.get(user);
        if(accessLevel==null){
            return false;
        }
        return true;
    }
}
