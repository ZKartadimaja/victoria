public abstract class LibraryItem {
    protected String title;
    protected String itemId;
    protected boolean ischeckOut = false;

    public LibraryItem(String title, String itemId){
        this.title = title;
        this.itemId = itemId;
        this.ischeckOut = false;
    }

    public String getTitle(){
        return title;
    }

    public String getItemId(){
        return itemId;
    }

    public boolean isIscheckOut(){
        return ischeckOut;
    }

    public abstract void checkOut();

    public abstract  void returnItem();

    public abstract void printDetails();

}
