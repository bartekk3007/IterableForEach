import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("Jan", "Kowalski", 35));
        arrayList.add(new Person("Andrzej", "Konieczny", 30));
        arrayList.add(new Person("Bartek", "Kołakowski", 40));
        arrayList.forEach(s -> s.setAge(s.getAge() + 5));
        for (Person person : arrayList)
        {
            System.out.println(person);
        }
    }
}