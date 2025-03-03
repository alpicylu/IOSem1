

def last[A](xs: List[A]): A =
    if (xs.tail == Nil) {
        xs.head
    } else {
        last(xs.tail)
    }

println( last (List(1, 9, 5, 6, 3)) )