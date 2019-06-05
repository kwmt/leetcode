package cycle

import "fmt"

func main() {
	fmt.Print("test")

	//head := &ListNode{3, &ListNode{2, &ListNode{0, &ListNode{-4, nil}}}}
	//
	//m := map[*ListNode]bool{}
	//for head.Next != nil {
	//
	//	if m[head] {
	//		return true
	//	} else  {
	//		m[head] = true
	//	}
	//	head = head.Next
	//}

}

type ListNode struct {
	Val  int
	Next *ListNode
}

func hasCycle(head *ListNode) bool {
	m := map[*ListNode]bool{}
	for head.Next != nil {

		if m[head] {
			return true
		} else {
			m[head] = true
		}
		head = head.Next
	}
	return false
}
