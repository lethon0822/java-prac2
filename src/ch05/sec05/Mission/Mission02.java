package ch05.sec05.Mission;

public class Mission02 {
    public static void main(String[] args) {
        String fileName = "가나asgafdafh다라.haha.jpeg";
        int idx = fileName.lastIndexOf(".");
        String ext = fileName.substring(idx+1);
        System.out.println(ext);
    }
}
