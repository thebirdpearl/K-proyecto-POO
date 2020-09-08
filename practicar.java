//clase que desgloza los diversos ejercicios a realizar
import java.util.Scanner;
public class practicar{
  String tema = "";
  int conteo = 0;
  int aciertos = 0;
  int califica = 0;
  String retorno = "";
  //crear una variable del tipo de cada clase que corresponde a un tema de aprendizaje
  saludos sal = new saludos();
  familia fam = new familia();
  diaria diar = new diaria();
  //desde el driver se debe indicar el número que corresponde al tema escogido y del cual se desplegará el ejercicio a realizar
  public String seleccion(int op){
    if (op == 1){
      tema = sal.saluda(); //desplegar un ejercicio del tema saludos

      //califica = sal.calis();
    }else if(op == 2){
      tema = fam.famili(); //desplegar un ejercicio del tema familia
      //califica = fam.calif();
    }else if(op == 3){
      tema = diar.diari(); //desplegar un ejercicio del tema vida diaria
      //califica = diar.calid();
    }
    //Verificar si la persona ha respondido correctamente, esta parte del código será utilizada hasta la próxima entrega
    /*if(califica == 1){
      retorno = "Ha respondido correctamente el ejercicio";
      aciertos = aciertos + 1; //llevar el conteo de los aciertos
    }else{
      retorno = "No ha respondido correctamente el ejercicio";
    }*/
    return tema;//devolver el mensaje dependiendo de la acción realizada por el ususario
  }
}
