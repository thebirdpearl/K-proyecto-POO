//clase que desgloza los diversos ejercicios a realizar
import java.util.Scanner;
public class practicar{
int tema = 0;
int aciertos = 0;
//crear una variable del tipo de cada clase que corresponde a un tema de aprendizaje
saludos sal = new saludos();
familia fam = new familia();
diaria diar = new diaria();

//desde el driver se debe indicar el número que corresponde al tema escogido y del cual se desplegará el ejercicio a realizar
public void seleccion(int op){
  if (op = 1){
    tema = sal.saludos(); //desplegar un ejercicio del tema saludos
  }else if(op = 2){
    tema = fam.familia(); //desplegar un ejercicio del tema familia
  }else if(op == 3){
    tema = diar.diaria(); //desplegar un ejercicio del tema vida diaria
  }else{
    return false; //se debe avisar al usuario desde el drivver que ha indicado una opción que no es válida
  }
  if(tema = 1){
    aciertos = aciertos + 1; //llevvar el conteo de los aciertos
  }
}
}
