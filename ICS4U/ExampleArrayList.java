package ICS4U;

import java.util.ArrayList;

public class ExampleArrayList {
    public static void main(String[] args) {
        //creating list
        ArrayList<String> names = new ArrayList<>();

        //add students names
        names.add("Ella");
        names.add("Danny");
        names.add("Aiden");
        names.add("Sophie");
        names.add("Ryan");

        //remove a student by name
        names.remove("Ryan");

        //print remaining names
        System.out.printf("Names in the list: \n");
        for (String name : names) {
            System.out.println(name);
        }

        //see if particular student is on list
        String checkName = "Ella";
        if (names.contains(checkName)) {
            System.out.println(checkName + " is on the list!");
        }
        else {
            System.out.println(checkName + " isn't on the list");
        }

        //find the length of the list
        int length = names.size();
        System.out.println("They're " + length + " people on the list");

        //clear the list
        names.clear();

        //print list after clearing it
        System.out.println("Names in the list after clearing: \n" + names);

    }   

}
