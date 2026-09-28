
class PrivateKeys2 {

    public static void main(String[] args) {
        Pen p = new Pen();
        p.setPageNum(100);
        System.out.println(p.getPageNum());
    }

}

class Pen {

    private int pageNum;

    void setPageNum(int x) {
        if (x > 0) {
            pageNum = x;
        }
    }

    int getPageNum() {
        return pageNum;
    }
}
