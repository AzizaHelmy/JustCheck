import SwiftUI

struct ContentView: View {
    @ObservedObject var viewModel: ViewModel
    
    init() {
        self.viewModel = ViewModel()
    }
    
    var body: some View {
        List(viewModel.users, id: \.self) { user in
            VStack {
                Spacer()
                HStack {
                    AsyncImage(url: URL(string: user.image))
                        .frame(width: 50, height: 50)
                        .clipShape(RoundedRectangle(cornerSize: CGSize(width: 10, height: 10)))
                    VStack(alignment: .leading, content: {
                        Text("\(user.name)")
                        Text(user.phone)
                    })
                }
                Spacer()
            }
        }.onAppear{
            self.viewModel.observeDataFlow()
        }
    }
}
