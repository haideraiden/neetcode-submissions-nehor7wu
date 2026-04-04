public class Solution {
    public bool IsAnagram(string s, string t) {
        if(s.Length!=t.Length)
        return false;

        char[] i = s.ToCharArray();
        char[] j = t.ToCharArray();
        Array.Sort(i);
        Array.Sort(j);

        //string i = Array.Sort(s);
        //string j= Array.Sort(t);

        for(int k=0; k<i.Length; k++)
        {
            if(i[k]!=j[k])
            return false;
        }

        return true;

    }
}
