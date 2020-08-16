package vn.simple.entity;

import java.util.List;
import java.util.Map;

public class Employee {
    private String id;
    private String name;
    private List<String> list;
    private Map<String, Object> map;

    public Map<String, Object> getMap() {
        return this.map;
    }

    public void setMap(final Map<String, Object> map) {
        this.map = map;
    }

    public Employee(){

    }

    public Employee(String id){
        this.id = id;
    }

    public Employee(String id, String name){
        this.id = id;
        this.name = name;
    }

    public List<String> getList() {
        return this.list;
    }

    public void setList(final List<String> list) {
        this.list = list;
    }

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String call(){
        return "Calling an employee named " + this.name;
    }

    public void init(){
        System.out.println("Init is being called");
    }

    public void destroy(){
        System.out.println("Destroy is being called");
    }
}
