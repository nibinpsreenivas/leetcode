# Problem statement
Given the root of a binary tree, invert the tree, and return its root.

## Example 1

![alt text](https://assets.leetcode.com/uploads/2021/03/14/invert1-tree.jpg)

>Input: root = [4,2,7,1,3,6,9]
>Output: [4,7,2,9,6,3,1]

## Example 2

![alt text](https://assets.leetcode.com/uploads/2021/03/14/invert2-tree.jpg)

>Input: root = [2,1,3]
>Output: [2,3,1]

## Example 3

>Input: root = []
>Output: []

# Code Explanation: Invert Binary Tree

This code defines a JavaScript function called `invertTree` that is used to invert a binary tree. The function takes a single argument, `root`, which is the root node of the binary tree.

## Function Overview

The primary purpose of this function is to invert the left and right subtrees of the binary tree rooted at `root`. This operation effectively swaps the left and right children of each node in the tree, resulting in an inverted tree.

## Code Explanation

Let's break down the code step by step:

1. **Base Case:**
    ```javascript
    if (!root) {
        return root;
    }
    ```
    - This code checks if the `root` node is `null` or `undefined`, which serves as the base case for the recursive function. If `root` is `null`, there is no need to perform any inversion, so the function immediately returns `root`.

2. **Inverting the Subtrees:**
    ```javascript
    let temp = root.left;
    root.left = root.right;
    root.right = temp;
    ```
    - In this part, the code swaps the `left` and `right` child nodes of the current `root`. This is done by temporarily storing the `left` child node in a variable `temp`, then updating `root.left` to be the `right` child node and `root.right` to be the `temp` (previously `left`) child node. This effectively swaps the positions of the left and right subtrees under the current node.

3. **Recursion:**
    ```javascript
    invertTree(root.left);
    invertTree(root.right);
    ```
    - After swapping the left and right subtrees, the code recursively calls the `invertTree` function on both the left and right subtrees. This recursive approach ensures that the inversion process is applied to all nodes in the tree until the base case is reached.

4. **Return the Root:**
    ```javascript
    return root;
    ```
    - Finally, the function returns the `root` node after the inversion is complete. This is essential as it allows the caller to obtain the root of the inverted binary tree.

## Example Usage

Here's an example of how you might use this function:

```javascript
// Define a sample binary tree
const root = {
    value: 1,
    left: {
        value: 2,
        left: null,
        right: null
    },
    right: {
        value: 3,
        left: null,
        right: null
    }
};

// Invert the binary tree
const invertedRoot = invertTree(root);

// The 'invertedRoot' now represents the inverted tree.
