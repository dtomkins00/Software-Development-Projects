package club;


/**
 * Store details of club memberships.
 * 
 * @author Drew Tomkins 
 * @version 1.0 - 21/11/18
 */
import club.ClubDemo;
import club.Membership;
import java.util.ArrayList;
import java.util.Iterator;

public class Club
{
	// ArrayList of membership is defined
    private ArrayList<Membership> members;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // members is set to the ArrayList<membership>
        members = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
    	members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    
    /**
    * Determine the number of members who joined in a
    * given month, depending on whether or not the
    * value for months is within 1 to 12.
    * @param month The month we are interested in.
    * @ return The number of members who joined in that
    month.
    */
    public int joinedInMonth(int month)
    {
      int count = 0;
      
      if(month < 1 || month > 12) {
           System.out.println("Month " + month + " out of range. " + "It must be in the range 1 ... 12");
    }
      
    else {
         for(Membership member : members) {
             if(member.getMonth() == month) {
                  count++;
               }
            }
         }
    return count;
 }
    
    /**
    * Remove from the club’s collection all members who
    * who joined in the given month, and return them
    * stored in a separate collection object.
    * @param month The month of the membership.
    * @param year The year of the membership.
    * @return The members who joined in the given month
    * and year.
    */
    public ArrayList<Membership> purge(int month, int year)
    {
        ArrayList<Membership> purged = new ArrayList<Membership>();
        if(month < 1 || month > 12) {
           System.out.println("Month " + month + " out of range. " + "It must be in the range 1 ... 12");
    }
        
    else {
        Iterator<Membership> it = members.iterator();
          while(it.hasNext()) {
            Membership member = it.next();
             if(member.getMonth() == month &&
                       member.getYear() == year) {
    it.remove();
    purged.add(member);
                 }
           }
     }
  return purged;
    }
    
    /** Register 2 new members into the club and
     * print the number of members out as well as
     * noting any purged members if necessary.
     * @param args
     * @return numberOfMembers The number of members
     * who have been registered.
     * @return purge Any members who have been purged
     * with the purge method.
     */
    public static void main(String[] args)
    {
    	ClubDemo clubDemo = new ClubDemo();
    	clubDemo.demo();
    	
    	Club club = new Club();
    	
		club.join(new Membership("David", 2, 2004));
        club.join(new Membership("Michael", 1, 2004));
                
        System.out.println("The club has " + club.numberOfMembers() + " members.");
        System.out.println("We have purged " + club.purge(1, 2004) + " members.");
    }
}
