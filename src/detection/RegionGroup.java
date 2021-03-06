package detection;

import java.util.*;

public class RegionGroup {
   private int id;
   private ArrayList<RegionInfo> members;
   public int minX;
   public int minY;
   public int maxX;
   public int maxY;
   private boolean closed;

   public RegionGroup() {
      this.id = -1;
      this.members = new ArrayList<RegionInfo>();
      this.closed = false;
   }

   public RegionGroup(int id) {
      this.id = id;
      this.members = new ArrayList<RegionInfo>();
      this.closed = false;
   }

   public RegionGroup(int id, RegionInfo r) {
      this.id = id;
      this.members = new ArrayList<RegionInfo>();
      this.members.add(r);
      this.closed = false;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getId() {
      return this.id;
   }

   public void addMember(RegionInfo r) {
      this.members.add(r);
   }

   public void addMembers(ArrayList<RegionInfo> members) {
      for (RegionInfo r : members) {
         r.textGroup = this.id;
         this.members.add(r);
      }
   }

   public void clearMembers() {
      this.members.clear();
   }

   public ArrayList<RegionInfo> getMembers() {
      return this.members;
   }

   public boolean isClosed() {
      return this.closed;
   }

   public void setClosed(boolean b) {
      this.closed = b;
   }
   
   public String toCSV() {
	   return "";
   }
}

