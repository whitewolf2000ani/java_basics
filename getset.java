class Getset{
    private int Employee_ID;

    public void setId(int eid){
        Employee_ID=eid;
    }
    public int getId(){
        return Employee_ID;
    }

}

class Test{
    public static void main(String args[]){
        Getset g=new Getset();
        g.setId(100);
        int id=g.getId();
        System.out.println("ID:"+id);
    }
}