import java.lang.reflect.Array;
import java.util.ArrayList;

public class traductor 
{
    dmomo d = new dmomo();
    public ArrayList<String> esp = new ArrayList<String>();
    public ArrayList<String> kaq = new ArrayList<String>();

    public traductor()
    {        
        esp = d.esp;
        kaq = d.kaq;
        for(int i = 0; i < esp.size(); i++)
        {
            esp.set(i, esp.get(i).toLowerCase());
        }
        for(int i = 0; i < kaq.size(); i++)
        {
            kaq.set(i, kaq.get(i).toLowerCase());
        }
    }

    public String eak(String e)
    {
        int pos = esp.indexOf(e.toLowerCase());
        return d.kaq.get(pos);
    }

    public String kae(String e)
    {
        int pos = kaq.indexOf(e.toLowerCase());
        return d.esp.get(pos);
    }

    public boolean checkesp(String e)//función para checar que, efectivamente, la palabra que ingresó está registrada en español
    {
        if(esp.indexOf(e.toLowerCase()) == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public boolean checkkaq(String e)//función para checar que, efectivamente, la palabra que ingresó está registrada en kaqchikel
    {
        if(kaq.indexOf(e.toLowerCase()) == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
