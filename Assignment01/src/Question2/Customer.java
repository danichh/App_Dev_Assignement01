// --------------------------------------------------------------------
// Assignment 01
// Written by: Danich Hang 1951307
// For Application Development 2 (Mobile) - Winter 2022
// --------------------------------------------------------------------
package Question2;

/**
 *
 * @author Danich Hang
 */
public class Customer {
    private String name; 
    private boolean member; 
    private String memberType;

    public Customer(String name) {
        this.name = name;
        this.member = false;
        this.memberType = "noMember";
    }
    

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        if(isMember())
            this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", member=" + member + ", memberType=" + memberType + '}';
    }

}
