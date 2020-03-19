package ex4$;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * @author XinLan Wang
 * @create 2020-03-18 14:51
 */
public class DAO<T> {
    private HashMap<String,T>map = null;

    public DAO() {
              map = new HashMap<>();
    }

    public void save(String id, T entity){
        if (!map.containsKey(id)){
            map.put(id,entity);
        }
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        if (map.containsKey(id)){
            map.put(id,entity);
        }
    }
    public List<T> list(){
        Collection<T> values = map.values();
        ArrayList<T> list = new ArrayList<>();
        for(T t:values){
            list.add(t);
        }
//        return (List<T>) values;
        return list;
    }

    public List<T> remove(){
        return null;
    }
}
