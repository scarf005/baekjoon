#!/bin/fish

function add_range
    set RANGE "$argv[1]""???"
    set MAIN 'src/main/kotlin/*/'$RANGE.kt
    set TEST 'src/test/kotlin/*/'_"$RANGE"KtTest.kt
    set CASE src/test/resources/$RANGE.yaml

    git add $MAIN $TEST $CASE
end

for RANGE in $argv
    add_range $RANGE
end
