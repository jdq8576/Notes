package thread.atomic;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class TestAtomicReferenceFieldUpdater {
    public static void main(String[] args) {

        Student student = new Student();

        AtomicReferenceFieldUpdater<Student, String> updater = AtomicReferenceFieldUpdater.newUpdater(Student.class, String.class, "name");

        updater.compareAndSet(student, null, "Tim");

        System.out.println(student);

    }
}

class Student {
    volatile String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
