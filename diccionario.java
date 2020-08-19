import java.util.ArrayList;
import java.util.List;

class diccionario{

    public String biblioteca (int numero){

        //el numero, ay no jodan es para usar array
        int num = numero;

        //espanol, para las palabras en espanol.
        //kaq, para las palabras en kaqchikel.
        String[] espanol = new String[20];
        String[] kaq = new String[20];

        String respuesta = null;

        if(num < 20){
            //Voc de saludos
            espanol[0] = "Buenos días";
            espanol[1] = "Gracias";
            espanol[2] = "Buenas noches";
            espanol[3] = "¿Cómo estas?";
            espanol[4] = "Bien gracias";

            //Voc de familia
            espanol[5] = "Familia";
            espanol[6] = "Madre";
            espanol[7] = "Padre";
            espanol[8] = "Hijos";
            espanol[9] = "Nieto";

            //Voc de diario
            espanol[10] = "¿Cuál es tu nombre?";
            espanol[11] = "Dormitorio";
            espanol[12] = "Sala";
            espanol[13] = "Baño";
            espanol[14] = "Cocina";

            espanol[15] = "Cabeza";
            espanol[16] = "Oreja";
            espanol[17] = "Nariz";
            espanol[18] = "Ojos";
            espanol[19] = "Boca";

            kaq[0] = "Saqer";
            kaq[1] = "Matyox";
            kaq[2] = "Xo’qa";
            kaq[3] = "La ütz awäch?”, ";
            kaq[4] = "Ütz matyox";

            kaq[5] = "Ach´alal";
            kaq[6] = "Te´ej";
            kaq[7] = "Tata´aj";
            kaq[8] = "Alk´walaxela";
            kaq[9]= "mam";

            kaq[10] = "Achike ab’i’ rat?";
            kaq[11] = "warab’äl";
            kaq[12] = "nimajay";
            kaq[13] = "ruxikin jay";
            kaq[14] = "ruchi’ q’aq’";

            kaq[15] = "jolomaj";
            kaq[16] = "xikinaj";
            kaq[17] = "tzamaj";
            kaq[18] = "runaq’ wachaj";
            kaq[19] = "chi’aj";


            respuesta = espanol[num] + "," + kaq[num];

            return respuesta;

        } else{

            return respuesta;

        }

    }
    
}