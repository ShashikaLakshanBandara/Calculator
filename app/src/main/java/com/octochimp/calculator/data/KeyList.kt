package com.octochimp.calculator.data

import com.octochimp.calculator.CalculatorEvents
import com.octochimp.calculator.model.Key


val keys = listOf(
    Key(keyName = "AC", onPressed = { onEvent ->
        onEvent(CalculatorEvents.onClickACButton)
    }

    ),
    Key(keyName = "CE", onPressed = { onEvents ->
        onEvents(CalculatorEvents.onClickCEButton)

    }),
    Key(keyName = "-/+", onPressed = { onEvents ->
        onEvents(CalculatorEvents.onClickNegativeButton)
    }),

    Key(keyName = "X", onPressed = { onEvent ->
        onEvent(CalculatorEvents.onClickOperator("*"))
    }),
    Key(keyName = "7", onPressed = { onEvent ->
        onEvent(CalculatorEvents.onClickNumber("7"))
    }),
    Key(keyName = "8", onPressed = { onEvent ->
        onEvent(CalculatorEvents.onClickNumber("8"))

    }),
    Key(keyName = "9", onPressed = { onEvent ->
        onEvent(CalculatorEvents.onClickNumber("9"))
    }),
    Key(keyName = "/", onPressed = { onEvent ->
        onEvent(CalculatorEvents.onClickOperator("/"))

    }),
    Key(keyName = "4", onPressed = { onEvent ->
        onEvent(CalculatorEvents.onClickNumber("4"))
    }),
    Key(keyName = "5", onPressed = { onEvent ->
        onEvent(CalculatorEvents.onClickNumber("5"))
    }),
    Key(keyName = "6", onPressed = { onEvent ->
        onEvent(CalculatorEvents.onClickNumber("6"))
    }),
    Key(keyName = "-", onPressed = { onEvent ->
        onEvent(CalculatorEvents.onClickOperator("-"))

    }),
    Key(keyName = "1", onPressed = { onEvent ->
        onEvent(CalculatorEvents.onClickNumber("1"))
    }),
    Key(keyName = "2", onPressed = { onEvent ->
        onEvent(CalculatorEvents.onClickNumber("2"))
    }),
    Key(keyName = "3", onPressed = { onEvent ->
        onEvent(CalculatorEvents.onClickNumber("3"))
    }),
    Key(keyName = "+", onPressed = { onEvent ->
        onEvent(CalculatorEvents.onClickOperator("+"))

    }),
    Key(keyName = "0", onPressed = { onEvent ->
        onEvent(CalculatorEvents.onClickNumber("0"))
    }),
    Key(keyName = ".", onPressed = { onEvent ->
        onEvent(CalculatorEvents.onClickDecimalPoint)
    }),
    Key(keyName = "=", onPressed = { onEvent ->
        onEvent(CalculatorEvents.onClickEqualButton)

    }),
    Key(keyName = "", onPressed = { onEvent ->
        onEvent(CalculatorEvents.onClicklightModeButton)
    }),

    )