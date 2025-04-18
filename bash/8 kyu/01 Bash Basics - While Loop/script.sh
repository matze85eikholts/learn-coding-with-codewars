#!/bin/bash

countToTwenty() {
  # Initialize the counter
  count=1

  # Start the while loop
  while [ $count -le 20 ]; do
    echo "Count: $count"
    # Increment the counter
    count=$((count + 1))
  done
}

countToTwenty