package manager;

import model.Board;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyDataProvider {

    @DataProvider
    public static Iterator<Object[]>boardModel(){
        List<Object[]> list= new ArrayList<>();
        list.add(new Object[]{new Board().withTitle("testModel1")});
        list.add(new Object[]{new Board().withTitle("testModel2")});
        list.add(new Object[]{new Board().withTitle("testModel3")});
        return list.iterator();
    }

}