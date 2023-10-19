package iterator;

public class NameRepository implements Container {
    public Student students[] = {
            new Student("1", "Mr QAZI SAMI", "Male", "0333-3334440"),
            new Student("2", "ASIM", "Male", "0331-444400"),
            new Student("3", "ASAD", "Female", "0333-54645654"),
            new Student("4", "QUAID", "Female", "0332-7777777")
    };

    @Override
    public Iterator getIterator() {
        return new StudentIterator();
    }

    private class StudentIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return students[index--];
            }
            return null;
        }

        @Override
        public Student previous() {
            if (index < students.length - 1) {
                return students[++index];
            }
            return null;
        }

        @Override
        public void MoveToFirst() {
            index = 0;
        }

        @Override
        public void MoveToLast() {
            index = students.length - 1;
        }




    }
}