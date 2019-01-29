/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojects;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author li.yu
 */
public class MembershipManagement {
    
    final private Scanner reader = new Scanner(System.in);
    private int getIntInput(){
        int choice = 0;
        while (choice == 0)
        {
            try
            {
                choice = reader.nextInt();
                if(choice == 0)
                    throw new InputMismatchException();
                reader.nextLine();
            }
            catch(InputMismatchException e){
                reader.nextLine();
                System.out.print("\nERROR:INVALID INPUT. Please try again:");
            }
        }
        return choice;
    }
    
    private void printClubOptions(){
        System.out.println("1) Club Mercury");
        System.out.println("2) Club Neptune");
        System.out.println("3) Club Jupiter");
        System.out.println("4) Multi Clubs");
        
    }
    public int getChoice (){
        int choice;
        //3402
        System.out.println("\nWeLCOME TO OZONE FITNESS CENTER");
        System.out.println("=================================");
        System.out.println("1)Add Member");
        System.out.println("2)Remove Member");
        System.out.println("3)Display Member Information");
        
        System.out.print("\nPlease select an option(or Enter -1 to quit):");
        choice = getIntInput();
        return choice;
        
    }
    public String addMembers(LinkedList<Member>m)
    {
        String MemberName;
        int Club;
        String mem;
        double MemberFees;
        int MemberID;
        Member mbr;
        Calculator<Integer>cal;
        
        System.out.print("\nPlease eter the member's name:");
        MemberName = reader.nextLine();
        
        printClubOptions();
        System.out.print("\nPlease enter the member's clubID:");
        Club = getIntInput();
        
        while(Club < 1 || Club> 4)
        {
            System.out.print("\nInvalid ClubID.Please try again:");
            Club = getIntInput();
        }
        if (m.size()>0)
            MemberID = m.getLast().getMemberID()+1;
        else
            MemberID = 1;
        if(Club!=4)
        {
            cal =(n)->{
                switch (n)
                {
                    case 1:
                        return 900;
                    case 2:
                        return 950;
                    case 3:
                        return 1000;
                    default:
                        return -1;
                }
            };
            MemberFees=cal.calculateFees(Club);
            
            mbr = new SingleClubMember('S',MemberID,MemberName,MemberFees,Club);
            m.add(mbr);
            mem=mbr.toString();
            
            System.out.println("\nSTATUS:Single Club member added\n");
        }
        else
        {
            cal=(n)->{
                if (n == 4)
                    return 1200;
                else
                    return -1;
            };
            MemberFees = cal.calculateFees(Club);
            
            mbr = new MultiClubMember('M', MemberID, MemberName, MemberFees, 100);
            m.add(mbr);
            mem = mbr.toString();
            
            System.out.println("\nSTATUS: Multi Club Member add\n");
        }
        return mem;
        
    }
    public void removeMember(LinkedList<Member>m){
        int MemberID;
        
        System.out.print("\nEnter Member ID to remove:");
        MemberID = getIntInput();
        
        for(int i=0;i<m.size();i++)
        {
            if (m.get(i).getMemberID()==MemberID)
            {
            m.remove(i);
            System.out.print("\nMember Removed\n");
            return;
            }
        }
        System.out.println("\nMemberID not found\n");
    }
    
    public void printMemberInfo(LinkedList<Member>m){
        int MemberID;
        
        System.out.print("\nEnter MemberID to display information:");
        MemberID=getIntInput();
        
        for (int i =0;i<m.size();i++)
        {
            if (m.get(i).getMemberID()==MemberID)
            {
                String[] MemberInfo =m.get(i).toString().split(",");
            
            System.out.println("\n\nMemberType="+ MemberInfo[0]);
            System.out.println("MemberID ="+ MemberInfo[1]);
            System.out.println("MemberName="+ MemberInfo[2]);
            System.out.println("MembershipFees="+ MemberInfo[3]);
            
            if (MemberInfo[0].equals("S"))
            {
                System.out.println("ClubID ="+ MemberInfo[4]);
            }else
            {
                System.out.println("Membership Points= " + MemberInfo[4]);
            }
            return;
        }
    }
                System.out.println("\nMemberID not found\n");
}    
}
