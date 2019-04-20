## 代码结构
```
- main.java.com.thoughtworks.tdd
    -Main 程序入口
    -FizzBuzz  包括倍数判断方法，倍数情况计算，结果构造等
    -FizzBuzzGame 负责游戏整体流程
    -SpecialNumberCreator 负责随机生成3个特殊数字
    
- test.java.com.thoughtworks.tdd
    -FizzBuzzTest  
    -FizzBuzzGameTest 
    -SpecialNumberCreatorTest 
```
## 注意
```
1、最终倍数情况用按位或进行计算
2、2的n次方为1<<n
```