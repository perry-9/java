package perry;

class petdog {
    public static String name;
    public int age;
    public String color;

    public void barks() {
        name="makailong";
        System.out.println(name + ":汪汪汪");
    }
    public void barks2(){

        System.out.println(name + ":汪汪汪");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
