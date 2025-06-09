package ch05.sec05.Method;

public class Mission02Method {
    public static void main(String[] args) {
        String ext = getExt("sadf.sadf.jpg"); // jpg
        String ext2 = getExt("sad222f.sakf111.jpeg");
        System.out.println(ext);
        System.out.println(ext2);
    }

    public static String getExt(String fileName) {
        // lastIndexOf : 뒤에서 .이 처음 나온 인덱스 값(int) 가져오기
        int idx = fileName.lastIndexOf(".");
        // substring : 인덱스 값(int)에서부터 시작하는 String을 복사해서 String 변수에 담기
        String ext = fileName.substring(idx+1);
        return ext;
    }
}
