package leetcode;

/**
 * Created by zhaoguanjun on 2016/9/22.
 */
public class _71SimplifyPath {
    public static String simplifyPath(String path) {
        if(path == null)
            return null;
        String[] str = path.split("/");
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < str.length; i++) {
            if(str[i].equals("."))
                continue;
            else if(str[i].equals("..")) {
                if(sb.toString().equals("") || sb.toString().equals("/"))
                    continue;
                sb.delete(sb.lastIndexOf("/"), sb.length());
            }else if (!str[i].equals("")){
                sb.append("/" + str[i]);
            }
        }
        return sb.toString().equals("") ? "/" : sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("////home////../a/"));
    }
}
