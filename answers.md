1.  public static String flip {
        int r = (int)(Math.random)*3;
        if(r < 2) {
            return heads;
        } else {
            return tails;
        }
    }

2. public static boolean arePermuations(int[] a, int[] b){
        for(int aValue : a) {
            // checking to make sure every single element of a is equal to b
        }
        for(int bValue : b) {
            found = true;
        }
        if(!found){
            return false;
        }
        return true;
    }

3. The first sequence will have 0 switches, the second one makes 4, 2, 3, 1, then 2 and 3 switches to produce 4, 3, 2, 1, and the third one switches the 3 with itself. 