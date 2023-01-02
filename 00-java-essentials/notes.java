// 基本数据类型

int number = 100;
long theLong = 782_939_210L;
float theFloat = 78.2939210F;
System.out.println(theFloat);
System.out.println(theLong);

// 引用数据类型

Date date = new Date();
String name = new String("Coding");
System.out.println(name.toUpperCase());
LocalDate now = LocalDate.now();
System.out.println(now);
System.out.println(now.getMonth());

static class Person {
  String name;
  Person(String name) {
    this.name = name;
  }
}
Person alex = new Person("alex");
Person mariam = alex;
System.out.println(alex.name + " " + mariam.name);
mariam.name = "Mariam";
System.out.println(alex.name + " " + mariam.name);
System.out.println(alex.name.charAt(0));
String am = new String("am");
System.out.println(alex.name.contains(am));
System.out.println(alex.name.equals(mariam.name));

// 包和导入包

java.time.LocalDateTime localDateTime = java.time.LocalDateTime.now();
System.out.println(localDateTime);

// 算数运算

System.out.println(10 * (2 + 7) - 4.5);
System.out.println(Math.abs(-10));
System.out.println(Math.max(12.1, 120));
System.out.println((int)Math.pow(5.0, 2));

// 比较操作符和逻辑操作符

int khalidAge = 18;
int mariamAge = 20;
boolean isKhalidOlderThanMariam = khalidAge > mariamAge;
System.out.println(isKhalidOlderThanMariam);
System.out.println(khalidAge != mariamAge);
System.out.println(true || false);
System.out.println(true && false);

// if 语句和三元操作符

int age = 17;
if (age >= 18) {
  System.out.println("Adult");
} else if (age < 18 && age >= 11 ) {
  System.out.println("Teenager");
}else{
  System.out.println("baby");
}

System.out.println(false ? 1 : 2);

// switch 语句

String gender = "female";
switch(gender){
  case "male":
    System.out.println("Male");
    break;
  case "female":
    System.out.println("Female");
    break;
  default:
    System.out.println("Other");
}

// 数组

int [] numbers = new int[5];
System.out.println(Arrays.toString(numbers));
numbers[2] = 3;
String [] strings = {"Hello", "Mother", "Fuckers"};
System.out.println(Arrays.toString(strings));
System.out.println(strings.length);
int zero = numbers[4];
System.out.println(zero);
int numbers2 [] = {1, 34, 45, 46, 47, 48, 49, 50, 51, 52, 53};
System.out.println(numbers2[numbers2.length - 1]);

for(int i = 0; i < numbers2.length; i++){
  System.out.println(numbers2[i]);
}

// 增强 for 循环

System.out.println("Enhanced for loop");
for(int num : numbers2){
  System.out.println(num);
}

for(String strStr : strings){
  System.out.println(strStr.toUpperCase());
}

Arrays.stream(numbers).forEach(System.out::println);

// continue

String names3 [] = {"Ali", "Alice", "Bob", "Mike"};
for (String name3 : names3){
  if(name3.startsWith("A")){
    continue;
  }
  System.out.println(name3);
}

// while 循环
int count = 0;
while(count <= 20){
  System.out.println(count++);
}

do{
  System.out.println(count++);
}while(count <= 30);

// 用户输入

Scanner scanner = new Scanner(System.in);
System.out.println("What is your name?");
String userName = scanner.nextLine();
System.out.println("Hello, " + userName);
System.out.println("How old are you?");
String ageStr = scanner.nextLine();
int ageInt = Integer.parseInt(ageStr);
int year = LocalDate.now().minusYears(ageInt).getYear();
System.out.println("You were born in: " + year);

// 方法

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] searchLetterArr = scanner.next().toLowerCase().toCharArray();
    char searchLetter = searchLetterArr[0];
    char[] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'd', 'd', 'd', 'd', 'd', 'e'};
    int count = countOccurrences(letters, searchLetter);
    System.out.println(count);
    scanner.close();
}

public static int countOccurrences(char[] letters, char searchLetter) {
    int count = 0;
    for (char letter : letters) {
        if (letter == searchLetter) {
        count++;
        }
    }
    return count;
}

//类和对象

public static void main(String[] args) {
  Lens lensOne = new Lens("sony", "85mm", true);
  Lens lensTwo = new Lens("sony", "30mm", true);
  Lens lensThree = new Lens("canon", "24-70mm", false);
  System.out.println(lensOne.brand);
  System.out.println(lensTwo.isPrime);
  System.out.println(lensThree.focalLength);
}

static class Lens {
  String brand;
  String focalLength;
  boolean isPrime;
  //constructor构造器
  Lens(String brand, String focalLength, boolean isPrime){
    this.brand = brand;
    this.focalLength = focalLength;
    this.isPrime = isPrime;
  }
}

public static void main(String[] args) {
  Passport ukPassport = new Passport("1", "uk", LocalDate.of(2025, 1, 1));
  Passport usPassport = new Passport("2", "us", LocalDate.of(2024,1,1));
  Passport caPassport = new Passport("3", "ca", LocalDate.of(2023,1,1));
  System.out.println(caPassport.date);
  System.out.println(ukPassport.date);
  System.out.println(usPassport.number);
}

static class Passport {
  String number;
  String country;
  LocalDate date;

  public Passport(String number, String country, LocalDate date) {
    this.number = number;
    this.country = country;
    this.date = date;
  }
}

// 原始数据类型和引用数据类型

int a = 10;
int b = a;  
a = 20;
// b = 10; a = 20

static class Person {
	String name;
	Person(String name) {
		this.name = name	
	}
}

Person alex = new Person("Alex")
Person mariam = alex;    
// Both Reference alex and mariam points to Object Person("Alex")

// 按值传递

static void incrementValue(int value) {
	value++;
}
int x = 0;
incrementValue(x);    // x = 0, no changes
// takes a copy and pass it into function 
static int incrementValue(int value) {
	return value + 1;
}
int y = incrementValue(x);  // y = 1

// 通过引用传递

static void changePoint(Point point) {
	point.x = 0;
	point.y = 0;
}

Point point = new Point(100, 100);
changePoint(point);    // (0, 0)

// 变量关键字

var age = 10;
var now = LocalDate.now();

// final 关键字

final var name = "Anna";
// cannot change the value once you've assigned it (cannot reassign it)
final Point point = new Point(0, 0);
point.x = 100;
point.y = 100;
// can still change the attribute 

// 访问修饰符

static class Lens {}    // package protected
public static class Lens {}   // can be accessed from outside package
private static class Lens {}     // accessible within parent class
protected static double Pi = Math.PI

// 方法

private static LocalDate getDateMinusDays(int v) {
	return LocalDate.now().minusDays(v);
}
var date = getDateMinusDays(10);

// 对象

Object[] name = {"Jamil"};
Object p = new Point();
// Object is the root of any other Class
String name = "Jamil";

// 基本数据类型和包装类

Integer number = 1;
number.toString();
List<Integer> numbers = null;
numbers.add(1);
// Double Long...

// 静态关键字

static class Person {
	static int createdPeople = 0;
	Person(String name) {
		this.name = name;
		createdPeople++;
	}
}
Person alex = new Person("alex");
Person bob = new Person("bob");
System.out.println(Person.createdPeople);     // 2
// Because createPeople does not belong to alex or bob, it belongs to the Person Class.

public static final String BRAND;
static List list;
static {
	BRAND = "code";
	list = new ArrayList();
	list.add("");
}
Statics.BRAND;

// 类和行为

public class Iphone {
	// properties
	private String model;
	private double price;    
	private boolean isWaterResistant;
	// behaviors
	public String getModel() {
		return model;
	}	
	public void setModel(String model) {
		this.model = model;
// this refers to the current Instance of the current Class
	}
	public double getPrice() {
		return price;
	}	
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isWaterResistant() {
		return isWaterResistant;
	}	
	public void setWaterResistant(boolean waterResistant) {
		this.isWaterResistant = waterResistant;
	}
}

// 创建对象

Iphone iphone7Plus = new iPhone();
iphone7Plus.setModel("7+");
iphone7Plus.setPrice(6000);
iphone7Plus.setWaterResistant(false);
System.out.println(iphone7Plus.getModel());
System.out.println(iphone7Plus.getPrice());
System.out.println(iphone7Plus.isWaterResistant());

// 构造函数

public Iphone() {}      // default constructor
public Iphone(String model, double price, boolean isWaterResistant) {
	this.model = model;
	this.price = price;
	this.isWaterResistant = isWaterResistant;
}       // use this constructor to set initial values
public iPhone(String model) {
	this.model = model;
}

// 构造函数中的 this 关键字

public Iphone(String model) {
	this(model, -1.0, false);   // set default value
	this.model = model;
}

// toString() 方法转字符串

@Override
public String toString() {
	return "Iphone{" + "model='" + model + '\'' + ", price=" + price + ", isWaterResistant=" + isWaterResistant + '}';
}
System.out.println(iphone7Plus);

// 枚举

public enum IphoneModel {
	IPHONE_7_PLUS,
	IPHONE_7,
	IPHONE_X;
}

public class Iphone {
	private IphoneModel model;
	private double price;    
	private boolean isWaterResistant;
    // add here constructor, getter, setter
}
Iphone iphone7Plus = new iPhone(IphoneModel.IPHONE_7_PLUS, 150.00);

public enum IphoneModel {
	IPHONE_7_PLUS("Iphone 7+"),
	IPHONE_7("Iphone 7"),
	IPHONE_X("Iphone x");
	private String model;
	IphoneModel(String modelStr) {
		this.modelStr = modelStr;
	}
	// also add getter and setter here
}
System.out.println(iphone7Plus.getModel());  //IPHONE_7_PLUS
System.out.println(iphone7Plus.getModel().getModelStr());    //Iphone 7+

// 面向对象编程（OOP）
// abstraction, encapsulation, Inheritance, Polymorphism

// 封装

public class Iphone {
	IphoneModel model;
	double price;
	boolean isWaterResistant;
}
Iphone iPhone = new Iphone();
iphone.price = 0;
public class Iphone {
	private IphoneModel model;
	private double price;
	private boolean isWaterResistant;
	public void setPrice(double price) {
		if (price < 0) {
			throw new IllegalArgumentException("")
		}
		this.price = price;
	}
}
iphone.setPrice(0);

// 继承

public class Animal {
	private String name;
	public Animal(String name) {
		this.name = name;
	}
	// getName(); setName();
}
Animal animal = new Animal("bobby");
System.out.println(animal.name);

public class Dog extends Animal {
	private String breed;
	public Dog(String name, String breed) {
		super(name);     //get the name of superclass
		this.breed = breed;
	}
	// getBreed();
}
Dog dog = new Dog("flex", "Bulldog");
System.out.println(dog.getName());
System.out.println(dog.getBreed());

// 抽象

abstract public class Animal {
	private String name;
	// constructor, getName(); setName();
	public abstract void makeSound();
    // abstract methods have no implementation
}

public class Dog extends Animal {
	private String breed;
	public Dog(String name, String breed) {
		super(name);     //get the name of superclass
		this.breed = breed;
	}
	// getBreed();
	@Override
	public void makeSound() {
		System.out.println("woof woof");
	}
}

Animal dog = new Dog("flex", "Bulldog");
dog.makeSound();

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
	@Override
	public void makeSound() {
		System.out.println("miao miao");
	}
}

Animal cat = new Cat("rosie");
cat.makeSound();
// with abstract Classes, you can not instantiate it.

// 多态性

dog.makeSound();
cat.makeSound();
System.out.println("A" + "B");
System.out.println(1 + 2);

// 接口  
// within interfaces, you can only write abstract methods

public interface AnimalInterface {
	void makeSound();	
	String getName();
}

public class Cat implements AnimalInterface {
	private String name;
	@Override
	public void makeSound() {
		System.out.println("miao");
	}
	@Override
	public String getName() {
		return this.name;
	}
}

AnimalInterface cat = new Cat("rosie");
cat.makeSound();

// 方法重载

public class SuperMath {
	public int add(int a, int b){
		return a+b;
	}

	public int add(int a, int b, int c){
		return a+b+c;
	}

}

SuperMath superMath = new SuperMath();
result1 = superMath.add(1, 99);
result2 = superMath.add(1, 99, 199);

// 数据结构

// 数组
int[] numbers = new int[3];    // specify the size
numbers[0] = 1;
int[] numbers2 = {1, 2, 3, 4};
System.out.println(Array.toString(numbers));
for (int number : numbers) {
	System.out.println(number);	
}

// 列表

List numbers = new ArrayList();
numbers.add(10);    // (element)
numbers.add(20);
numbers.add(0, -10);     // (index, element)
numbers.remove(1);    // (index)
System.out.println(numbers.contains(10));
System.out.println(numbers.size());
System.out.println(numbers);
numbers.forEach(System.out::println);
numbers.clear();
System.out.println(numbers.isEmpty());

// 泛型 Generics

List<Integer> numbers = new ArrayList<>();
for(int number : numbers) {
	System.out.println(number);	
}

// 集合

Set<Character> charactersSet = new HashSet<>();
charactersSet.add('A');
charactersSet.add('B');
// duplicates are not allowed in Set and order is not guaranteed
Iterator<Character> iterator = charactersSet.iterator();
while (iterator.hasNext()) {
	Character character = charactersSet.iterator().next();
	System.out.println(character);
}

// 映射表

Map<Integer, String> map = new HashMap<>();
map.put(1, "Hannah");
map.put(2, "Jamil");
map.put(3, "Alice");
map.put(3, "Carla");
System.out.println(map.get(3));    // Carla
System.out.println(map.keySet()); 
for (int key : map.keySet()) {
	System.out.println(map.get(key));
}

map.forEach((k, v) -> {
	System.out.println(k + " - " + v);
});

String defaultV = map.getOrDefault(10, "oops this is default value");
System.out.println(defaultV);

// 堆栈 Stack LIFO

Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.push(2);
stack.push(3);
System.out.println(stack.peek());    // 3
stack.pop();    // Pop removes and return the top element
System.out.println(stack);

// 队列 Queue FIFO

Queue<Person> queue = new LinkedList<>();
queue.add(new Person("James"));
queue.add(new Person("Jamila"));
queue.offer(new Person("Abu"));    // offer will return false when the queue is full whereas add will throw an exception
System.out.println(queue);
System.out.println(queue.peek());
queue.poll();    // removes and return the first element
queue.forEach(person -> System.out.println(person.name));

static class Person {
	String name;
	Person(String name) {
		this.name = name;
	}
}

// 日期类

ZonedDateTime now = ZonedDateTime.now();
LocalDateTime nowLDT = localDateTime.now();
LocalDate localDate = LocalDate.now();
LocalTime localTime = LocalTime.now();
Instant instant = Instant.now();
ZoneID.getAvailableZoneIds().forEach(System.out::println);
LocalDateTime LDTT = LocalDateTime.now(ZoneId.of("Australia/West"));
System.out.println(LDTT);
LocalDate someDate = LocalDate.of(2000, Month.SEPTEMBER, 1);
System.out.println(someDate.minus(2, ChronoUnit.DECADES));
System.out.println(someDate.isAfter(LDTT.toLocalDate()));
System.out.println(someDate.getYear());
System.out.println(someDate.getMonth());
System.out.println(someDate.getDayofWeek());

// 慎用 double 和 Double 

double numberOne = 0.02;
double numberTwo = 0.03;
double result = numberTwo - numberOne;   // 0.009999

// 大的小数类 BigDecimal

BigDecimal numberOne = new BigDecimal(0.02);
BigDecimal numberTwo = new BigDecimal(0.03);
BigDecimal result = numberTwo.subtract(numberOne);
System.out.println(numberOne.compareTo(numberTwo));

// 处理空值 null（不建议）

String brand = null;
try {
	System.out.println(brand.toUpperCase());
} catch (NullPointerException e) {
	System.out.println("Brand is null");
}

// Optional 处理空值

String brand = null;
String theBrand = Optional.ofNullable(brand).map(String::toUpperCase).orElseGet(() -> {
	// logic
	return "Samsung";
});
System.out.println(theBrand);

// 异常 Exception
// Checked Exceptions

public static void main(String[] args) throws FileNotFoundException {
	FileInputStream inputStream = new FileInputStream("example.txt");
}

// Unchecked Exceptions

try {
	var result = 10 / 0;
	System.out.println(result);
}catch (ArithmeticException | NullPointerException e) {
	System.out.println("cannot divide number by 0");
} finally {
	System.out.println("cleaning up...")
}

// 自定义异常

static class MyException extends RuntimeException {
	public MyException(String message) {
		super(message);
	}
}

static double performDivision(double a, double b) {
	if (b == 0) {
		throw new MyException("cannot divide by 0");
	}
	return a / b;
}

performDivision(1, 0);

// 创建文件

String filename = "src/data.csv";
File file = new File(filename);
if (!file.exists()) {
	try {
		file.createNewFile();
		System.out.println(file.getName() + " created");
	}  catch {
		System.out.println("Error: " + e);
	}
}

// 使用 PrintWriter 写入文件

try {
	FileWriter fileWriter = new FileWriter(filename, true);    // append: true, instead of override
	PrintWriter writer = new PrintWriter(fileWriter);
	writer.println("id, name,enail\n1,Jamila,jamila@qq.com");
	writer.println("2,Alex,alex@qq.com");
	writer.close();
	writer.flush();
	System.out.println("contents added");
} catch (IOException e) {
	System.out.println("Error: " + e);
}

// 读取文件

try {
	FileReader filerReader = new FileReader(file);
	BufferedReader reader = new BufferedReader(filename);
	String contents = "";
	while ((contents = reader.readLine()) != null) {
		System.out.println(contents);
	}
	reader.close();
} catch (IOException e) {
	System.out.println("Error: " + e);
}

// 解析文件

public class User {
	private Integer id;
	private String name;
	private String email;
	// generate constructor, getter, setter
}

try {
	FileReader filerReader = new FileReader(file);
	BufferedReader reader = new BufferedReader(filename);
	String contents = "";
	System.out.println("header = " + reader.readLine());    // skip the header line
	List<User> users = new ArrayList<>();
	while ((contents = reader.readLine()) != null) {
		String[] split = contents.split(",");
		int id = Integer.parseInt(split[0]);
		String name = split[1];
		String email = split[2];
		User user = new User(id, name, email);
		users.add(user);
	}
	reader.close();
	// looping through users list
	users.forEach(System.out::println);
} catch (IOException e) {
	System.out.println("Error: " + e);
}