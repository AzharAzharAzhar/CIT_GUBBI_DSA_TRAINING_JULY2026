package Day2;

class person{
    String name;
    int age;
    person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name: "+ this.name+"Age: "+this.age+"\n");
    }
}

public class P2_oops1 {
    public static void main(){

        person[] arr = new person[2];
        for(int i=0; i< arr.length; i++){
            arr[i] = new person("Raj", 21);
        }
        for(person i: arr){
            i.display();
        }
    }
}
