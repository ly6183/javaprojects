/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojects;

/**
 *
 * @author ly6183
 */
public class MultiClubMember extends Member {
    
    private int MembershipPoints;
    
     MultiClubMember(char pMemberType, int pMemberID, String pMemberName, double pMemberFees, int pMembershipPoints){
        super(pMemberType, pMemberID, pMemberName, pMemberFees);
        //
        MembershipPoints = pMembershipPoints;
        //
    }
    
    public void setMembershipPoints(int pMembershipPoints){
    MembershipPoints = pMembershipPoints;
    }
    
    public int getMembershipPoints(){
    return MembershipPoints;
    
}
    @Override
 public String toString(){
     //
 return super.toString() + ','+MembershipPoints;
       // 
}
    
    
}

