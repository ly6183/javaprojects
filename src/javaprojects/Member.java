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
public class Member {
     char MemberType;
     int MemberID;
     String MemberName;
     double MemberFees;
    
    
 Member(char pMemberType, int pMemberID, String pMemberName, double pMemberFees)  {
     
     //
     MemberType = pMemberType;
     MemberID = pMemberID;
     MemberName = pMemberName;
     MemberFees = pMemberFees;
     //
     
     
 }
    
 public void setMemberType(char pMemberType)
 {
     MemberType = pMemberType;
 }
 public char getMemberType()
 {
     return MemberType;
 }
        
 public void setMemberID(int pMemberID)
 {
     MemberID = pMemberID;
 }
 public int getMemberID()
 {
     return MemberID;
 }
 public void setMemberName(String pMemberName)
 {
     MemberName = pMemberName;
 }
 public String getMemberName()
 {
     return MemberName;
 }
 public void setMemberFees(double pMemberFees)
 {
     MemberFees = pMemberFees;
 }        
 public double getMemberFees()
 {
     return MemberFees;
 }
 
 
 @Override
 public String toString(){
   return MemberType+","+MemberID+","+MemberName+","+MemberFees;



 }

 
 
 
 
}
