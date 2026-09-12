class Sorting
{
    public static void main(String[] args)
    {
        if (args.length < 2)
        {
            System.out.println("No Command Line Arguments. Please provide at least two numbers.");
            return;
        }

        int[] arr = new int[args.length];

        try
        {
            for (int i = 0; i < args.length; i++)
            {
                arr[i] = Integer.parseInt(args[i]);
            }

            System.out.print("UnSorted array: ");

            for (int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + " ");
            }

            bubbleSort(arr);

            System.out.println();

            System.out.print("Sorted array: ");

            for (int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + " ");
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Please enter valid integers.");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bounds. Please check your input.");
        }
    }

    private static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        int temp;

        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}