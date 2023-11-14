# TimeManager

class TimeManager:

public Properties:
  mTime: MutableStateFlow(Int)

public Methods:
  timerStart()
  timerStop()
  timerReset()

## Example
in ViewModel:
  val mTM = TimeManager()

in Composable:
  val mStartScreenViewModel: StartScreenViewModel = viewModel()
  val mTime by mStartScreenViewModel.mTM.mTime.collectAsState()
  
