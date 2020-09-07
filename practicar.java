//clase que desgloza los diversos ejercicios a realizar
import java.util.Scanner;
public class practicar{
int tema = 0;
int conteo = 0;
int aciertos = 0;
String retorno = "";
//crear una variable del tipo de cada clase que corresponde a un tema de aprendizaje
saludos sal = new saludos();
familia fam = new familia();
diaria diar = new diaria();

//desde el driver se debe indicar el número que corresponde al tema escogido y del cual se desplegará el ejercicio a realizar
public String seleccion(int op){

  if (op = 1){
    tema = sal.saludos(); //desplegar un ejercicio del tema saludos
  }else if(op = 2){
    tema = fam.familia(); //desplegar un ejercicio del tema familia
  }else if(op == 3){
    tema = diar.diaria(); //desplegar un ejercicio del tema vida diaria
  }
  //Verificar si la persona ha respondido correctamente
  if(tema = 1){
    retorno = "Ha respondido correctamente el ejercicio";
    aciertos = aciertos + 1; //llevar el conteo de los aciertos
  }else{
    retorno = "No ha respondido correctamente el ejercicio";
  }
  return retorno;//devolver el mensaje dependiendo de la acción realizada por el usuario
}
}
