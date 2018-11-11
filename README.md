# java8-learning
## 行为参数化
行为参数化：就是一个方法接受多个不同的行为作为参数，并在内部使用它们，完成不同行为的能力。

传递代码：就是将新行为作为参数传递给方法。java8之前，为接口声明许多只用一次的实体类而造成的啰嗦代码，也可以用匿名类来实现

代表性的例子：Comparator,Runnable以及GUI事件处理
## Lambda表达式
### 函数式接口
函数式接口就是只定义一个抽象方法的接口。

Lambda表达式允许直接以内联的形式为函数式接口的抽象方法提供实现，并将整个表达式作为函数式接口的实例

@FunctionalInterface标明接口为函数式接口

### 如何使用Lambda
1. 行为参数化
2. 定义函数式接口传递行为
3. 定义方法执行行为
4. 传递Lambda表达式（具体实现）

### 使用函数式接口
1. Predicate<T>
接口定义了一个test抽象方法，接受泛型T对象，返回boolean
boolean test(T t);
2. Consumer<T>
接口定义了一个accept抽象方法，接受泛型T对象，无返回
void accept(T t);
3. Function<T,R>
接口定义了一个apply抽象方法，接受泛型T对象，返回泛型R对象
R apply(T t);

### 方法引用
#### 如何构建方法引用
1. 指向静态方法的方法引用，如Integer::parseInt
2. 指向任意类型实例方法的方法引用，如String::length
3. 指向现有对象的实例方法的方法引用，如假设现有个局部变量expensiveTransaction用于存放Transaction类型的对象，他支持实例方法getValue，方法引用
为expensiveTransaction::getValue

#### 构造函数引用
ClassName::new,指向默认的无参构造函数

## Stream
