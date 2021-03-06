package detection;

import java.util.*;

public class Seed {
   public int index;
   public int minX;
   public int minY;
   public int maxX;
   public int maxY;
   public boolean closed;
   public RegionGroup rg;

   public Seed(int idx, int x1, int y1, int x2, int y2, boolean b) {
      this.index = idx;
      this.minX = x1;
      this.minY = y1;
      this.maxX = x2;
      this.maxY = y2;
      this.closed = b;
      this.rg = null;
   }

   public Seed(int idx, int x1, int y1, int x2, int y2, boolean b, RegionGroup g) {
      this.index = idx;
      this.minX = x1;
      this.minY = y1;
      this.maxX = x2;
      this.maxY = y2;
      this.closed = b;
      this.rg = g;
   }
}

