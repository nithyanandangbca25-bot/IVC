class SumNaturalNumbers {
static int calculateSum(int n) {
int sum = 0;
for (int i = 1; i <= n; i++) {
sum += i;
}
return sum;
}
public static void main(String[] args) {
int n = 10; // declared value
int result = calculateSum(n);
System.out.println("Sum of " + n + " natural numbers: " +

result);
}
}