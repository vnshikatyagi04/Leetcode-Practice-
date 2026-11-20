class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        solve(res, "", 0, 0, n);
        return res;
    }

    public void solve(List<String> res, String s, int open, int close, int n) {

        if (s.length() == 2 * n) {
            res.add(s);
            return;
        }

        if (open < n) {
            solve(res, s + "(", open + 1, close, n);
        }

        if (close < open) {
            solve(res, s + ")", open, close + 1, n);
        }
    }
}