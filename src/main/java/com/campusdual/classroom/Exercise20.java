package com.campusdual.classroom;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
    //Hay que crear una LISTA de tipo ArrayList
        Person people1 = new Person("John","Smith");
        Teacher teacher1= new Teacher("Maria","Montessori","Educación");
        PoliceOfficer police1= new PoliceOfficer("Jake","Peralta","B-99");
        Doctor doctor1 = new Doctor("Gregory","House","Nefrologia e infectologia");

        //CREAMOS LA LISTA
      List<Person> listaPersonas = new ArrayList<>();
        listaPersonas.add(people1);
        listaPersonas.add(teacher1);
        listaPersonas.add(police1);
        listaPersonas.add(doctor1);
        return listaPersonas;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        for(Person listaPersona : stringList){
            listaPersona.getDetails();
        }


    }

    public static void main(String[] args) {
        //CREAMOS LA LISTA:
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }



}
