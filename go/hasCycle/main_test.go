package cycle

import "testing"

func TestPrint(t *testing.T) {

	//node3:= &ListNode{0, &ListNode{-4, node2}}
	//node2:= &ListNode{2, nil}
	//head := &ListNode{3, }

	expect:= true
	actual := hasCycle(head)
	if expect != actual {
		t.Errorf("actual: %t, expect: %t", actual, expect)
	}
}