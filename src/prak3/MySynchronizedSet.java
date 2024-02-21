package prak3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class MySynchronizedSet<E> implements Set<E> {

    private Set<E> set;
    public static final Semaphore semaphore = new Semaphore(1);

    public MySynchronizedSet(Set<E> set) {
        this.set = set;
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return set.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return set.iterator();
    }

    @Override
    public Object[] toArray() {
        return set.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return set.toArray(a);
    }

    @Override
    public boolean add(E e) {

        try {
            semaphore.acquire();
            boolean result = set.add(e);
            semaphore.release();
            return result;
        } catch (InterruptedException error) {
            error.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        try {
            semaphore.acquire();
            boolean result = set.remove(o);
            semaphore.release();
            return result;
        } catch (InterruptedException error) {
            error.printStackTrace();
        }
        return false;

    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return set.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {

        try {
            semaphore.acquire();
            boolean result = set.addAll(c);
            semaphore.release();
            return result;
        } catch (InterruptedException error) {
            error.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        try {
            semaphore.acquire();
            boolean result = set.retainAll(c);
            semaphore.release();
            return result;
        } catch (InterruptedException error) {
            error.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        try {
            semaphore.acquire();
            boolean result = set.removeAll(c);
            semaphore.release();
            return result;
        } catch (InterruptedException error) {
            error.printStackTrace();
        }
        return false;
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            set.clear();
            semaphore.release();
        } catch (InterruptedException error) {
            error.printStackTrace();
        }
    }
}
