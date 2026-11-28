class Solution {
    public boolean canAliceWin(int n) {
        int i=10;
        boolean alice = true;
        while(n>=i){
            n-=i;
            alice = !alice;
            i--;

        }
        return !alice;
    }
}