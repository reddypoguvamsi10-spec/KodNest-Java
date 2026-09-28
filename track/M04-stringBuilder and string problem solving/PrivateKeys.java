
class PrivateKeys {

    public static void main(String[] args) {
        Book b = new Book();
        b.setPageNum(10);
        System.out.println(b.getPageNum());
        b.setPageNum(30);
        System.out.println(b.getPageNum());
    }

}

class Book {

    private int pageNum;

    void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    int getPageNum() {
        return pageNum;
    }
}
