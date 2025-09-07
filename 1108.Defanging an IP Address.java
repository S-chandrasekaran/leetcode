class Solution {
    public String defangIPaddr(String address) {
        String g;
        g=address;
        g=g.replace(".","[.]");
        return g;
    }
}
