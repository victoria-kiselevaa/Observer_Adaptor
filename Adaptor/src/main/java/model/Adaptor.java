package model;

public class Adaptor {
    PriorityQ priorityQ;
    public Adaptor(int size){
        priorityQ=new PriorityQ(size);
    }
    public void AddElement(long item){
        priorityQ.insert(item);
    }
    public long SeachMinEl(){
        return priorityQ.peekMin();
    }
    public void deleteElement(){
        priorityQ.remove();
    }
    public String CheckElement(){
        if(priorityQ.isEmpty()){
            return "В очереди нет элементов";
        }else if (priorityQ.isFull()){
            return "Очередь заполнена";
        }else return "Очередь заполнена не полностью";
    }
    public String DisplayEl(){
        return priorityQ.display();
    }
}
