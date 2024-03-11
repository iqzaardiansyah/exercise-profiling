<details>
<summary>Tutorial Modul 5</summary>

`Before Optimize`
![all-student-name-jmeter-before.png](https://i.ibb.co/mC5DWfY/all-student-name-jmeter-before.png)
![all-student-name-jtl-before.png](https://i.ibb.co/hLFGyM8/all-student-name-jtl-before.png)
![highest-gpa-jmeter-before.png](https://i.ibb.co/t25GNMf/highest-gpa-jmeter-before.png)
![highest-gpa-jtl-before.png](https://i.ibb.co/VvprMTn/highest-gpa-jtl-before.png)

`After Optimize`
![all-student-name-jmeter-after.png](https://i.ibb.co/CvxHZ3s/all-student-name-jmeter-after.png)
![all-student-name-jtl-after.png](https://i.ibb.co/qMXZ4py/all-student-name-jtl-after.png)
![highest-gpa-jmeter-after.png](https://i.ibb.co/pdbX7kD/highest-gpa-jmeter-after.png)
![highest-gpa-jtl-after.png](https://i.ibb.co/Js5JJsC/highest-gpa-jtl-after.png)

After optimizing the code, we can see a decrease in elapsed time, even in some cases the decrease can be very significant, for example in the request `/all-student-name`.

<details>
<summary>Reflection</summary>

1. What is the difference between the approach of performance testing with JMeter and profiling with IntelliJ Profiler in the context of optimizing application performance?
    
    Performance testing with JMeter is geared towards assessing the overall system performance by simulating user interactions and measuring high-level metrics like response times and throughput in controlled testing environments. On the other hand, profiling with IntelliJ Profiler is focused on a detailed analysis of the application's  internal behavior at the code level during development, providing insights into method execution times, memory usage, and other low-level details. While JMeter is effective for evaluating system-wide performance and scalability, IntelliJ Profiler, integrated into the development environment, allows developers to pinpoint and optimize specific code sections, offering a more granular and actionable approach to application performance optimization. Combining both tools can provide a comprehensive strategy for achieving optimal performance.

2. How does the profiling process help you in identifying and understanding the weak points
in your application?

    Profiling is instrumental in identifying and understanding weak points in our application by offering detailed insights into its runtime behavior. Profilers analyze method-level execution times, memory usage, CPU and thread behavior, and hotspots within the code. This information aids in pinpointing critical sections of the codebase that contribute to performance bottlenecks. By visualizing call stacks, tracking object allocations, and monitoring I/O and network activities, profilers help developers identify issues related to method efficiency, memory leaks, excessive CPU utilization, and inefficient concurrency. Profiling tools, especially those integrated into development environments like IntelliJ Profiler, enable real-time analysis, allowing developers to address performance issues early in the development process. Overall, profiling plays a crucial role in optimizing an application by providing actionable data for performance improvements.

1. Do you think IntelliJ Profiler is effective in assisting you to analyze and identify
bottlenecks in your application code?

    Absolutely, IntelliJ Profiler proves highly effective in aiding me to analyze and identify bottlenecks in my code. Its seamless integration with the IntelliJ IDEA development environment allows for real-time analysis, offering insights into method-level performance, memory usage, and code hotspots.

1. What are the main challenges you face when conducting performance testing and
profiling, and how do you overcome these challenges?

    The challenge that I often think about when testing and profiling is whether my code can run quickly, efficiently and error-free because the applications that I might develop in the future will be used by many people with many and varied devices. The only way to handle this challenge is to remain consistent in learning to improve the quality of the code I type.
    
    Another challenge I faced when testing and profiling may not be the most significant but it is very annoying because when I do testing and profiling, my laptop has to be in top performance so I have to look for a power outlet first when I want to do testing and profiling. I know the solution is to just look for a power outlet, but looking at the situation in the new Fasilkom UI building, perhaps some students can relate to the fact that the new building lacks usable power outlets and extension cords.

1. What are the main benefits you gain from using IntelliJ Profiler for profiling your
application code?

    Using IntelliJ Profiler for profiling my application code provides several key benefits. Firstly, its seamless integration with the IntelliJ IDEA development environment streamlines the workflow, allowing for real-time, in-context analysis without the need for external tools. The profiler's method-level insights enable a granular understanding of code performance, helping me pinpoint and address specific bottlenecks efficiently. The visualizations, such as call tree representations and hotspot detection, offer a clear and intuitive overview of the application's runtime behavior, facilitating quick identification of critical areas for optimization. Additionally, the profiler's memory usage analysis and allocation tracking aid in identifying and rectifying memory-related issues. Overall, IntelliJ Profiler enhances the development process by offering a comprehensive set of tools for profiling and optimizing application code.

1. How do you handle situations where the results from profiling with Inte lliJ Profiler are
not entirely consistent with findings from performance testing using JMeter?

    Handling discrepancies between profiling results from IntelliJ Profiler and findings from performance testing with JMeter involves a systematic approach. Firstly, it's crucial to validate and understand the scope of each tool – IntelliJ Profiler focuses on code-level analysis, while JMeter assesses overall system performance. Variances may arise due to differences in testing environments, configurations, or the nature of simulated user interactions. To reconcile inconsistencies, cross-verify the results, considering potential environmental variations. Additionally, leverage complementary tools to gather a more comprehensive picture, combining JMeter's system-level insights with IntelliJ Profiler's code-centric analysis.

1. What strategies do you implement in optimizing application code after analyzing results
from performance testing and profiling? How do you ensure the changes you make do
not affect the application's functionality?

    Optimizing application code after analyzing results from performance testing and profiling involves a strategic and cautious approach. I prioritize addressing identified bottlenecks by focusing on code segments revealed through profiling as well as system-wide issues highlighted by performance testing tools like JMeter. The way I ensure that the changes I make do not affect the functionality of the application is by paying attention to the error indicators in the IDE that I use and testing the application many times until I am sure that there is no disruption to the application's functionality as a result of the new changes I make.

</details>
</details>