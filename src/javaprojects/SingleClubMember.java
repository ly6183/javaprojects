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
public class SingleClubMember extends Member {
    
    private int Club;
    
 SingleClubMember(char pMemberType, int pMemberID, String pMemberName, double pMemberFees, int pClub) {
        super(pMemberType, pMemberID, pMemberName, pMemberFees);
        //
        Club = pClub;
        //
    }
    public void setClub(int pClub)
 {
     Club = pClub;
 }
    public int getClub()
 {
     return Club;
 }
  
 
 @Override
 public String toString(){
     //
 return super.toString() + ","+ Club;
   //
        
}
}